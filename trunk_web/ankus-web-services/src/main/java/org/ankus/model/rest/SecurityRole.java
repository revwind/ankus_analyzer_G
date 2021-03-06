/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ankus.model.rest;

import org.springframework.security.core.GrantedAuthority;

/**
 * Security Role for Spring Security.
 *
 * @author Edward KIM
 * @since 0.2
 */
public class SecurityRole implements GrantedAuthority {

    /**
     * Authority
     */
    private String authority;

    public SecurityRole() {
    }

    public SecurityRole(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "SecurityRole{" +
            "authority='" + authority + '\'' +
            '}';
    }
}
