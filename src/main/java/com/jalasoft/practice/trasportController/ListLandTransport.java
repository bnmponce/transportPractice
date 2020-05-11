/*
 *
 *  Copyright (c) 2020 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 * /
 */

package com.jalasoft.practice.trasportController;

import com.jalasoft.practice.transport.Land;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {

    List<Land> land = new ArrayList<>();

    public void addLand( Land land) {

        this.land.add(land);
    }

    public void display() {

        land.stream().forEach(value -> System.out.println(value.displayData()));
    }
}
