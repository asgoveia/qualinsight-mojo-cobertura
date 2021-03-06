/*
 * qualinsight-mojo-cobertura
 * Copyright (c) 2015-2017, QualInsight
 * http://www.qualinsight.com/
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program. If not, you can retrieve a copy
 * from <http://www.gnu.org/licenses/>.
 */
package com.qualinsight.mojo.cobertura.core.check;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import com.qualinsight.mojo.cobertura.core.instrumentation.AbstractInstrumentationMojo;

/**
 * Mojo that checks if unit tests coverage is sufficient.
 *
 * @author Michel Pawlak
 * @author pfrank13
 */
@Mojo(name = "check-ut-coverage", defaultPhase = LifecyclePhase.PREPARE_PACKAGE)
public class UTCoverageCheckMojo extends AbstractCheckMojo {

    @Parameter(defaultValue = "${project.build.directory}/cobertura/ut/" + AbstractInstrumentationMojo.DATA_FILE_NAME, readonly = true)
    private String utCoverageDataFileLocation;

    @Override
    protected String getDataFileLocation() {
        return this.utCoverageDataFileLocation;
    }
}