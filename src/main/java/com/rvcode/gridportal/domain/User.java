package com.rvcode.gridportal.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

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
public class User extends DomainObject {
    public enum AccountType {
        ADMIN, USER
    }

    private String login;
    private String password;
    private AccountType accountType;
    private UserGroup group;
    private Set<Task> tasks;
    private Set<Certificate> certificates;
    private Set<Resource> resources;

    @OneToMany(mappedBy = "owner")
    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }

    @OneToMany(mappedBy = "owner")
    public Set<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(Set<Certificate> certificates) {
        this.certificates = certificates;
    }


    @OneToMany(mappedBy = "owner")
    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @ManyToOne
    public UserGroup getGroup() {
        return group;
    }

    public void setGroup(UserGroup group) {
        this.group = group;
    }

}
