package com.ahmadullahpk.alldocumentreader.util

import android.content.Context
import android.content.SharedPreferences

object SharedPrefManager {

    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        if (!::sharedPreferences.isInitialized) {
            sharedPreferences = context.getSharedPreferences(
                "app_shared_preference",
                Context.MODE_PRIVATE
            )
        }
    }

    internal fun getBoolean(key: String, defaultValue: Boolean) = sharedPreferences.getBoolean(key, defaultValue)

    internal fun putBoolean(key: String, saveValue: Boolean) {
        sharedPreferences.edit().putBoolean(key, saveValue).apply()
    }

    internal fun getInt(key: String, defaultValue: Int) = sharedPreferences.getInt(key, defaultValue)

    internal fun putInt(key: String, saveValue: Int) {
        sharedPreferences.edit().putInt(key, saveValue).apply()
    }

    internal fun getString(key: String, defaultValue: String) = sharedPreferences.getString(key, defaultValue)

    internal fun putString(key: String, saveValue: String) {
        sharedPreferences.edit().putString(key, saveValue).apply()
    }

    internal fun getStringSet(key: String, defaultValue: MutableSet<String>): MutableSet<String>? {
        return sharedPreferences.getStringSet(key, defaultValue)
            ?.map { it.split(" - ", limit = 2).let { (index, value) -> index.toInt() to value } }
            ?.sortedBy { it.first }
            ?.mapTo(mutableSetOf()) { it.second }
    }

    internal fun putStringSet(key: String, saveValues: MutableSet<String>) {
        sharedPreferences.edit()
            .putStringSet(key, saveValues.mapIndexedTo(mutableSetOf()) { index, s -> "$index - $s" })
            .apply()
    }

    internal fun removeKey(key: String) {
        sharedPreferences.edit().remove(key).apply()
    }
}
