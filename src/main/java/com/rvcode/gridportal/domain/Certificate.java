package com.rvcode.gridportal.domain;

import java.util.Date;
/**
 Copyright (c) 2012 Tanya Guza  <tanya.guza@gmail.com>

 This file is part of GridPortal.

 GridPortal is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 GridPortal is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with GridPortal.  If not, see <http://www.gnu.org/licenses/>.
 */

public class Certificate {
    private String fileName;
    private String description;
    private Date issued;
    private Date expires;
    private User owner;
}
