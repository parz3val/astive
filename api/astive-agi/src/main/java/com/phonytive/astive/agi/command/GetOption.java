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
package com.phonytive.astive.agi.command;

import java.io.Serializable;
import com.phonytive.astive.agi.annotation.AgiCommand;
import com.phonytive.astive.agi.annotation.Parameter;

/**
 * Behaves similar to {@link StreamFile} but used with a timeout option.
 *
 * @since 1.0.0
 */
@AgiCommand(command = "GET OPTION")
public class GetOption implements Serializable {
  /**
   * Serial version identifier.
   */
  private static final long serialVersionUID = 0xafac61aee3ea8592L;

  /**
   * Time in milliseconds to wait for DTMF.
   * <p>With timeout set to -1 this command wait forever.
   */
  @Parameter(position = 0x2)
  private Integer timeout;

  /**
   * Can be use to the interrupt the audio on a channel.
   */
  @Parameter(position = 0x1, optional = false)
  private String escapeDigits;

  /**
   * Audio to send to channel.
   */
  @Parameter(optional = false)
  private String file;

  /**
   * Create a new GetOption object with audio an escape digits. With this
   * constructor the command wait until a digit in escapeDigits is press.
   *
   * @param file audio to stream.
   * @param escapeDigits digits to interrupt the audio.
   */
  public GetOption(String file, String escapeDigits) {
    this.file = file;
    this.escapeDigits = escapeDigits;
    this.timeout = 0xffffffff;
  }

  /**
   * Create a new GetOption object with audio an escape digits. With this
   * constructor the command wait until a digit in escapeDigits is press.
   *
   * @param file audio to stream.
   * @param escapeDigits digits to interrupt the audio.
   * @param timeout time in milliseconds to wait for DTMF digit.
   */
  public GetOption(String file, String escapeDigits, Integer timeout) {
    this.file = file;
    this.escapeDigits = escapeDigits;
    this.timeout = timeout;
  }

  /**
   * Get the digits used to interrupt the audio.
   *
   * @return digits used to interrupt the audio.
   */
  public String getEscapeDigits() {
    return escapeDigits;
  }

  /**
   * Get audio to be send to <code>channel</code>.
   *
   * @return audio to be send to <code>channel</code>.
   */
  public String getFile() {
    return file;
  }

  /**
   * Get timeout(in milliseconds).
   *
   * @return time in milliseconds.
   */
  public Integer getTimeout() {
    return timeout;
  }

  /**
   * Set the digits to be use to interrupt the audio.
   *
   * @param escapeDigits digits to be use to interrupt the audio.
   */
  public void setEscapeDigits(String escapeDigits) {
    this.escapeDigits = escapeDigits;
  }

  /**
   * Set audio to be send to <code>channel</code>. Keep in mind that
   * the audio must not contain any extension.
   *
   * @param file audio to be send to <code>channel</code>
   */
  public void setFile(String file) {
    this.file = file;
  }

  /**
   * Set timeout(in milliseconds).
   *
   * @param timeout time in milliseconds
   */
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }
}
