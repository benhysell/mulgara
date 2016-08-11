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

import org.mulgara.connection.Connection;

/**
 * An AST element for commands that do not require processing.
 *
 * @created 2007-08-21
 * @author Paula Gearon
 * @copyright &copy; 2007 <a href="mailto:pgearon@users.sourceforge.net">Paula Gearon</a>
 * @licence <a href="{@docRoot}/../../LICENCE.txt">Open Software License v3.0</a>
 */
public class NullOp extends LocalCommand {

  /**
   * @see org.mulgara.query.operation.Command#isUICommand()
   */
  public boolean isUICommand() {
    return false;
  }

  /**
   * Do nothing.
   */
  public Object execute(Connection conn) {
    return null;
  }

}
