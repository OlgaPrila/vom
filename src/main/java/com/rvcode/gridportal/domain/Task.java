package com.rvcode.gridportal.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

@Entity
public class Task extends DomainObject {

    public enum TaskState {
          WAITING, RUNNING, FINISHED
    }

    public enum TaskResult{
        SUCCESS, FAILED
    }

    private User owner;
    private Date loaded;
    private Date finished;
    private TaskState state;
    private TaskResult result;

    public Date getLoaded() {
        return loaded;
    }

    public void setLoaded(Date loaded) {
        this.loaded = loaded;
    }

    @ManyToOne
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Date getFinished() {
        return finished;
    }

    public void setFinished(Date finished) {
        this.finished = finished;
    }

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(TaskResult result) {
        this.result = result;
    }

}
