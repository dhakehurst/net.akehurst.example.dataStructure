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
package simpleUml;

public class Model {

	public Model() {
		this.packages = new java.util.HashSet<simpleUml.Package>();
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	java.util.Set<simpleUml.Package> packages;
	public java.util.Set<simpleUml.Package> getPackages() {
		return packages;
	}
	public void setPackages(java.util.Set<simpleUml.Package> value) {
		this.packages = value;
	}
	
}
