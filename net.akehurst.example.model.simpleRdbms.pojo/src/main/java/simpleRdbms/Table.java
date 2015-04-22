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

public class Table {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Schema schema;
	public Schema getSchema() { return this.schema; }
	public void setSchema(Schema value) { this.schema = value; }
	
	java.util.Set<Column> pkey = new java.util.HashSet<Column>();
	public java.util.Set<Column> getPkey() {
		return pkey;
	}
	public void setPkey(java.util.Set<Column> pkey) {
		this.pkey = pkey;
	}

	java.util.Set<Column> column = new java.util.HashSet<Column>();
	public java.util.Set<Column> getColumn() {
		return column;
	}
	public void setColumn(java.util.Set<Column> column) {
		this.column = column;
	}

	java.util.Set<FKey> fkeys = new java.util.HashSet<FKey>();
	public java.util.Set<FKey> getFkeys() {
		return fkeys;
	}
	public void setFkeys(java.util.Set<FKey> fkeys) {
		this.fkeys = fkeys;
	}

	@Override
	public String toString() {
		return "Table { name='"+this.getName()+"' }";
	}
}
