package com.rvcode.gridportal.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
@Entity
public class Resource {

    public enum ResourceType {
        COMPUTING_ELEMENT, STORAGE_ELEMENT
    }

    private Integer id;
    private User owner;
    private ResourceType resourceType;

    @ManyToOne
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }
}
