/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package com.ahmadullahpk.alldocumentreader.xs.fc.hssf.formula;

/**
 * Should be implemented by any {@link com.ahmadullahpk.alldocumentreader.xs.fc.hssf.formula.ptg.Ptg} subclass that needs has an extern sheet index <br/>
 *
 * For POI internal use only
 *
 * @author Josh Micich
 */
public interface ExternSheetReferenceToken {
	int getExternSheetIndex();
	/**
	 * @return formula text for this reference token without the qualifying sheet name
	 */
	String format2DRefAsString();
}
