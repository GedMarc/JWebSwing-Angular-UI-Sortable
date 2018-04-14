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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.angularuisortable;

import com.jwebmp.base.html.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class AngularUISortableTest
{

	public AngularUISortableTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		List list = new List();
		AngularUISortable.applyToList(list);
		list.setID("id");
		System.out.println(list.toString(true));
		Assertions.assertEquals("<ul id=\"id\" ui-sortable></ul>", list.toString(0));
	}

}
