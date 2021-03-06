/*
 * 	Copyright (c) 2017. Toshi Inc
 *
 * 	This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.toshi.model.network;

import java.math.BigDecimal;

public class ExchangeRate {

    private String from;
    private String to;
    private BigDecimal rate;
    private Integer timestamp;

    // For tests only
    public ExchangeRate(final String from, final String to, final BigDecimal rate, final Integer timestamp) {
        this.from = from;
        this.to = to;
        this.rate = rate;
        this.timestamp = timestamp;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

}
