#!../../bin/linux-x86_64/Simple

#- You may have to change Simple to something else
#- everywhere it appears in this file

< envPaths

cd "${TOP}"

## Register all support components
dbLoadDatabase "dbd/Simple.dbd"
Simple_registerRecordDeviceDriver pdbbase

## Load record instances
dbLoadTemplate "db/user.substitutions"
sbLoadRecords "db/simple_gas_IOC.db", "INST=Simple_Gas_IOC"
#dbLoadRecords "db/SimpleVersion.db", "user=menorzinho"
#dbLoadRecords "db/dbSubExample.db", "user=menorzinho"

#- Set this to see messages from mySub
#var mySubDebug 1

#- Run this to trace the stages of iocInit
#traceIocInit

cd "${TOP}/iocBoot/${IOC}"
iocInit

## Start any sequence programs
#seq sncExample, "user=menorzinho"
