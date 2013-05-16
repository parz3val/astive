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
package org.astivetoolkit.agi.command;

import java.io.Serializable;
import org.astivetoolkit.agi.annotation.AgiCommand;

/**
 * Interrupts expected flow of Async AGI commands and returns control to
 * previous source (typically, the PBX dialplan).
 *
 * @since 1.0.0
 */
@AgiCommand(command = "ASYNC AGI BREAK")
public class AsyncAgiBreak implements Serializable {
  /**
   * Serial version identifier.
   */
  private static final long serialVersionUID = 0xa8da0d406d934e4bL;

  /**
   * Create a new AsyncAgiBreak object.
   */
  public AsyncAgiBreak() {
  }
}