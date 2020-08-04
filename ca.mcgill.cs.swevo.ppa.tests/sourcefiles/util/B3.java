/*******************************************************************************
 * PPA - Partial Program Analysis for Java
 * Copyright (C) 2008 Barthelemy Dagenais
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 3 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this library. If not, see 
 * <http://www.gnu.org/licenses/lgpl-3.0.txt>
 *******************************************************************************/
package p1;

public class B3 extends B3a {

	public void main() {
		a.b.c.d = new B3z();
		super.e = new B3z();
		z.super.y = new B3z();
		hello().f = new B3z();
		g = new B3z();
		h = new B3d() {
			void main() {
				i = new B3z();
			}
		};
		
		h = new B3b() {
			void main() {
				k = new B3z();
			}
		}
		
		h = new Runnable() {
			void main() {
				l = new B3z();
			}
		}
	}

}

class B3b extends B3c {
	
}