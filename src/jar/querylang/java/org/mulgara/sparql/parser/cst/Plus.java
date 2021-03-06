/*
 * Copyright 2008 Fedora Commons
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mulgara.sparql.parser.cst;

import java.util.ArrayList;


/**
 * An addition operator expression.
 *
 * @created Feb 13, 2008
 * @author Paula Gearon
 * @copyright &copy; 2008 <a href="http://www.fedora-commons.org/">Fedora Commons</a>
 * @licence <a href="{@docRoot}/../LICENCE.txt">Apache License, Version 2.0</a>
 */
public class Plus extends AssociativeNumericOpExpression {

  /**
   * Creates the addition operation
   * @param lhs The first expression
   * @param rhs The expression to be added to the lhs
   */
  public Plus(Expression lhs, Expression rhs) {
    this((NumericExpression)lhs, (NumericExpression)rhs);
  }

  /**
   * Creates the addition operation
   * @param lhs The first expression
   * @param rhs The expression to be added to the lhs
   */
  public Plus(NumericExpression lhs, NumericExpression rhs) {
    super(new ArrayList<NumericExpression>());
    if (lhs instanceof Plus) {
      operands.addAll(((Plus)lhs).operands);
    } else {
      operands.add(lhs);
    }
    operands.add(rhs);
  }

  /**
   * @see org.mulgara.sparql.parser.cst.AbstractNaryOperator#getOperatorString()
   */
  @Override
  protected String getOperatorString() {
    return "+";
  }

}
