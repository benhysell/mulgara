/**
 * The contents of this file are subject to the Open Software License
 * Version 3.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.opensource.org/licenses/osl-3.0.txt
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 */
package org.mulgara.query.filter;

import org.mulgara.query.QueryException;
import org.mulgara.query.filter.value.Var;


/**
 * Tests a variable to see if it is bound.
 *
 * @created Mar 17, 2008
 * @author Paula Gearon
 * @copyright &copy; 2008 <a href="mailto:pgearon@users.sourceforge.net">Paula Gearon</a>
 * @licence <a href="{@docRoot}/../../LICENCE.txt">Open Software License v3.0</a>
 */
public class BoundFn extends AbstractBooleanFn {

  /** Generated Serialization ID for RMI */
  private static final long serialVersionUID = 1266926199143113812L;

  /**
   * Create a function for testing a variable
   * @param operand The variable to test
   */
  public BoundFn(Var operand) {
    super(operand);
  }

  /** @see org.mulgara.query.filter.AbstractBooleanFn#fnTest() */
  boolean fnTest() throws QueryException {
    return ((Var)operand).isBound();
  }

}
