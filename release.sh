#!/bin/sh
params="-Dmaven.test.skip=true -Dmaven.javadoc.skip=true  -Dasciidoctor.skip=true"
./mvnw -s ~/.m2/settings_ali.xml -B clean release:prepare -Darguments="${params}" release:perform -Darguments="${params}"