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
/**
 * Implements the CFML Function getprofilesections
 */
package lucee.runtime.functions.other;

import java.io.IOException;

import lucee.commons.io.ini.IniFile;
import lucee.commons.io.res.util.ResourceUtil;
import lucee.runtime.PageContext;
import lucee.runtime.exp.PageException;
import lucee.runtime.ext.function.Function;
import lucee.runtime.op.Caster;

public final class GetProfileSections implements Function {
    public static lucee.runtime.type.Struct call(PageContext pc, String fileName) throws PageException {
	try {
	    return IniFile.getProfileSections(ResourceUtil.toResourceExisting(pc, fileName));
	}
	catch (IOException e) {
	    throw Caster.toPageException(e);
	}
    }

}