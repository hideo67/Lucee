/**
 *
 * Copyright (c) 2014, the Railo Company Ltd. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 * 
 **/
package lucee.runtime.ext.tag;

import /* JAVJAK */ javax.servlet.jsp.JspException;
import /* JAVJAK */ javax.servlet.jsp.tagext.BodyContent;
import /* JAVJAK */ javax.servlet.jsp.tagext.BodyTag;

/**
 * Implementation of the BodyTag
 */
public abstract class BodyTagSupport extends TagSupport implements BodyTag {

	/**
	 * Field <code>bodyContent</code>
	 */
	protected BodyContent bodyContent = null;

	@Override
	public void setBodyContent(final BodyContent bodyContent) {
		this.bodyContent = bodyContent;
	}

	@Override
	public void doInitBody() throws JspException {

	}

	@Override
	public int doAfterBody() throws JspException {
		return SKIP_BODY;
	}

	@Override
	public void release() {
		super.release();
		bodyContent = null;
	}
}