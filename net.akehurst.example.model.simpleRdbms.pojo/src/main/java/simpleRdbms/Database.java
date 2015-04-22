/*
 * Copyright (c) 2015 D. David H. Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package simpleRdbms;

public class Database {

	public Database() {
		this.schemas = new java.util.HashSet<Schema>();
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	java.util.Set<Schema> schemas;
	public java.util.Set<Schema> getSchemas() {
		return schemas;
	}
	public void setSchemas(java.util.Set<Schema> value) {
		this.schemas = value;
	}
	
}
