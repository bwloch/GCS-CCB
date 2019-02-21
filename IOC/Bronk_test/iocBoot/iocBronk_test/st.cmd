#!../../bin/linux-x86_64/Bronk_test

#- You may have to change Bronk_test to something else
#- everywhere it appears in this file

< envPaths

epicsEnvSet(STREAM_PROTOCOL_PATH, "../../Bronk_testApp/Db")
cd "${TOP}"

## Register all support components
dbLoadDatabase "dbd/Bronk_test.dbd"
Bronk_test_registerRecordDeviceDriver pdbbase

drvAsynSerialPortConfigure("SERIALPORT","/dev/ttyUSB0",0,0,0)
asynSetOption("SERIALPORT",-1,"baud","38400")
asynSetOption("SERIALPORT",-1,"bits","8")
asynSetOption("SERIALPORT",-1,"parity","none")
asynSetOption("SERIALPORT",-1,"stop","1")
#asynSetOption("SERIALPORT",-1,"clocal","Y")
#asynSetOption("SERIALPORT",-1,"crtscts","N")

dbLoadRecords("db/bronkhorst.db","PORT='SERIALPORT'")

## Load record instances


cd "${TOP}/iocBoot/${IOC}"
iocInit

## Start any sequence programs
#seq sncxxx,"user=bwloch"
