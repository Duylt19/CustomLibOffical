/*
 * 文件名称:          	SSEditor.java
 *  
 * 编译器:            android2.2
 * 时间:             	上午4:13:44
 */
package com.ahmadullahpk.alldocumentreader.xs.ss.control;

import com.ahmadullahpk.alldocumentreader.xs.common.shape.IShape;
import com.ahmadullahpk.alldocumentreader.xs.constant.MainConstant;
import com.ahmadullahpk.alldocumentreader.xs.java.awt.Rectangle;
import com.ahmadullahpk.alldocumentreader.xs.pg.animate.IAnimation;
import com.ahmadullahpk.alldocumentreader.xs.simpletext.control.IHighlight;
import com.ahmadullahpk.alldocumentreader.xs.simpletext.control.IWord;
import com.ahmadullahpk.alldocumentreader.xs.simpletext.model.IDocument;
import com.ahmadullahpk.alldocumentreader.xs.system.IControl;

import java.util.Collections;
import java.util.List;

/**
 * TODO: 文件注释
 * <p>
 * <p>
 * Read版本:        	Office engine V1.0
 * <p>
 * 作者:            	ljj8494
 * <p>
 * 日期:            	2013-3-22
 * <p>
 * 负责人:          	ljj8494
 * <p>
 * 负责小组:        	TMC
 * <p>
 * <p>
 */
public class SSEditor implements IWord
{

    public SSEditor(Spreadsheet ss)
    {
        this.ss = ss;
    }
    
    public IHighlight getHighlight()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<IHighlight> getHighlightList() {
        return Collections.emptyList();
    }

    @ Override
    public Rectangle modelToView(long offset, Rectangle rect, boolean isBack)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public IDocument getDocument()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public String getText(long start, long end)
    {
        // TODO Auto-generated method stub
        return "";
    }

    @ Override
    public long viewToModel(int x, int y, boolean isBack)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @ Override
    public byte getEditType()
    {
        return MainConstant.APPLICATION_TYPE_SS;
    }

    @ Override
    public IAnimation getParagraphAnimation(int pargraphID)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public IShape getTextBox()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public IControl getControl()
    {
        // TODO Auto-generated method stub
        return ss.getControl();
    }

    @ Override
    public void dispose()
    {
        ss = null;
    }
    
    private Spreadsheet ss;
}
