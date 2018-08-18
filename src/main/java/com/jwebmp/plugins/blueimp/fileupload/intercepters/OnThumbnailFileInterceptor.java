/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.blueimp.fileupload.intercepters;

import com.jwebmp.guicedinjection.pairing.Pair;

import java.io.InputStream;

/**
 * Specifies the get thumbnail interceptor
 */
@FunctionalInterface
public interface OnThumbnailFileInterceptor
{

	/**
	 * Returns the thumbnail in line with the given output filename
	 *
	 * @param filename
	 *
	 * @return
	 */
	Pair<String, InputStream> onThumbnailGet(String filename);
}
