/**
 * Copyright 2010 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook;

public interface GraphUser extends GraphObject {
    public String getId();
    public void setId(String id);

    public String getName();
    public void setName(String name);

    public String getFirstName();
    public void setFirstName(String firstName);

    public String getLastName();
    public void setLastName(String lastName);

    public String getLink();
    public void setLink(String link);

    public String getUsername();
    public void setUsername(String username);

    public String getBirthday();
    public void setBirthday(String birthday);

    public GraphLocation getLocation();
    public void setLocation(GraphLocation location);
}