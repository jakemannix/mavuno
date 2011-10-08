/*
 * Mavuno: A Hadoop-Based Text Mining Toolkit
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package edu.isi.mavuno.extract;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import edu.isi.mavuno.util.ContextPatternWritable;
import edu.umd.cloud9.collection.Indexable;

/**
 * @author metzler
 *
 */
public abstract class Extractor {

	// initialize extractor
	public abstract void initialize(String argSpec, Configuration conf) throws IOException;

	// set current document to extract from
	public abstract void setDocument(final Indexable doc);
	
	// consume next (context, pattern) pair
	public abstract boolean getNextPair(final ContextPatternWritable pair);	
}