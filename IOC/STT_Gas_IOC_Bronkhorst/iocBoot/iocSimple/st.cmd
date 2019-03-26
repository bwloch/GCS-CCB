#!../../bin/linux-x86_64/Simple

#- You may have to change Simple to something else
#- everywhere it appears in this file

< envPaths

epicsEnvSet(STREAM_PROTOCOL_PATH, "../../simpleApp/Db")
cd "${TOP}"

## Register all support components
dbLoadDatabase "dbd/Simple.dbd"
Simple_registerRecordDeviceDriver pdbbase

drvAsynSerialPortConfigure("SERIALPORT","/dev/ttyUSB0",0,0,0)
asynSetOption("SERIALPORT",-1,"baud","38400")
asynSetOption("SERIALPORT",-1,"bits","8")
asynSetOption("SERIALPORT",-1,"parity","none")
asynSetOption("SERIALPORT",-1,"stop","1")
#asynSetOption("SERIALPORT",-1,"clocal","Y")
#asynSetOption("SERIALPORT",-1,"crtscts","N")

## Load record instances
dbLoadTemplate("db/user.substitutions")
dbLoadRecords("db/simple_gas_IOC.db", "INST=Simple_Gas_IOC, PORT='SERIALPORT'")
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
