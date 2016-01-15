/*
 * Copyright 2009 DuraSpace.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mulgara.query.operation;

/**
 * This class indicates a command for the UI to set a local boolean property. 
 * @created Aug 17, 2007
 * @author Paula Gearon
 * @copyright &copy; 2007 <a href="mailto:pgearon@users.sourceforge.net">Paula Gearon</a>
 * @licence <a href="{@docRoot}/../../LICENCE.txt">Open Software License v3.0</a>
 */
public abstract class BooleanSetCommand extends SetCommand {

  protected static final String ON = "on";
  protected static final String OFF = "off";

  /** Indicates that option has been set on or off. */
  private final boolean on;
  
  /**
   * Create a command to set and option on or off.
   * @param on <code>true</code> if the option is on.
   */
  public BooleanSetCommand(boolean on) {
    this.on = on;
  }
  
  /**
   * @return the set option
   */
  public boolean isOn() {
    return on;
  }
}
