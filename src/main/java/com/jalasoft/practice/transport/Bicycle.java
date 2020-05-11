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

package com.jalasoft.practice.transport;

import com.jalasoft.practice.transport.Land;

public class Bicycle extends Land{

    boolean exerciseBike;

    public Bicycle( String name, int price, boolean hasMotor, boolean exerciseBike) {

        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    @Override
    public String displayData() {

        return super.displayData() + ", exerciseBike" + exerciseBike;
    }
}
