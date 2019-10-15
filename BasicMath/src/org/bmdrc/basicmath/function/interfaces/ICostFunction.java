/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Copyright (C) 2015, SungBo Hwang <tyamazaki@naver.com>.
 */

package org.bmdrc.basicmath.function.interfaces;

import java.util.List;
import org.bmdrc.ui.vector.Vector;

/**
 *
 * @author Sungbo Hwang (tyamazaki@naver.com)
 */
public interface ICostFunction extends IFunction {

    public Double calculateCost();
    
    public Double calculateCost(Vector theWeightVector);
    
    public abstract Double calculateCost(List<Double> theWeightList, List<Double> theDescriptorValueListInDataPoint);
}