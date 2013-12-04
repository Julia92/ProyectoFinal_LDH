package desmoj.extensions.chaining.abstractions;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Event;

/**
 * Interface which indicates that an station has a predecessor
 * 
 * @param <E>
 *            The Entity which can be handled by the station
 *          
 * @version DESMO-J, Ver. 2.4.0 copyright (c) 2013
 * @author Christian Mentz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License. 
 */
public interface HasPredecessor<E extends Entity> {
    
	/**
	 * This Method returns the start event of a Station which is used to set the successor
	 * 
	 * @return the star tevent
	 */
	Event<E> getStartEvent();

}