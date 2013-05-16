/*
 * Copyright (C) 2010-2012 PhonyTive LLC
 * http://astive.phonytive.com
 *
 * This file is part of Astive Toolkit
 *
 * Astive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Astive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Astive.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.astivetoolkit.agi.command.test;

import org.astivetoolkit.agi.command.SayNumber;
import org.astivetoolkit.agi.AgiException;
import org.astivetoolkit.agi.CommandProcessor;
import junit.framework.TestCase;

/**
 * DOCUMENT ME
 */
public class SayNumberTest extends TestCase {
  /**
   * Creates a new SayNumberTest object.
   *
   * @param testName DOCUMENT ME!
   */
  public SayNumberTest(String testName) {
    super(testName);
  }

  /**
   * DOCUMENT ME!
   *
   * @throws AgiException DOCUMENT ME!
   */
  public void testCommand() throws AgiException {
    int number = 0x7b;
    String escapeDigits = "";

    // Testing first constructor
    StringBuilder b = new StringBuilder("SAY NUMBER");
    b.append(" ");
    b.append(number);
    b.append(" ");
    b.append("\"");
    b.append(escapeDigits);
    b.append("\"");

    SayNumber command = new SayNumber(number);
    assertEquals(b.toString(), CommandProcessor.buildCommand(command));

    // Testing second constructor
    escapeDigits = "123";
    b = new StringBuilder("SAY NUMBER");
    b.append(" ");
    b.append(number);
    b.append(" ");
    b.append("\"");
    b.append(escapeDigits);
    b.append("\"");

    command = new SayNumber(number, escapeDigits);
    assertEquals(b.toString(), CommandProcessor.buildCommand(command));
  }
}