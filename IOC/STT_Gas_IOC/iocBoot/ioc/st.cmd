#!../../bin/linux-x86_64/ioc

#- You may have to change ioc to something else
#- everywhere it appears in this file

< envPaths

cd "${TOP}"

## Register all support components
dbLoadDatabase "dbd/ioc.dbd"
ioc_registerRecordDeviceDriver pdbbase

## Load record instances
dbLoadTemplate "db/user.substitutions"
dbLoadRecords "db/iocVersion.db", "user=menorzinho"
dbLoadRecords "db/dbSubExample.db", "user=menorzinho"

#- Set this to see messages from mySub
#var mySubDebug 1

#- Run this to trace the stages of iocInit
#traceIocInit

cd "${TOP}/iocBoot/${IOC}"
iocInit

## Start any sequence programs
#seq sncExample, "user=menorzinho"
