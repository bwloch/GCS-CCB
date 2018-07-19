#!../../bin/linux-x86/ArduinoIOC

## You may have to change ArduinoIOC to something else
## everywhere it appears in this file

< envPaths
cd "/home/menorzinho/EPICS/ArduinoIOC"

epicsEnvSet(STREAM_PROTOCOL_PATH, "ArduinoIOCApp/Db")

## Register all support components
dbLoadDatabase "dbd/ArduinoIOC.dbd"
ArduinoIOC_registerRecordDeviceDriver pdbbase

drvAsynSerialPortConfigure("SERIALPORT","/dev/ttyUSB0",0,0,0)
asynSetOption("SERIALPORT",-1,"baud","115200")
asynSetOption("SERIALPORT",-1,"baud","115200")
asynSetOption("SERIALPORT",-1,"bits","8")
asynSetOption("SERIALPORT",-1,"parity","none")
asynSetOption("SERIALPORT",-1,"stop","1")
asynSetOption("SERIALPORT",-1,"clocal","Y")
asynSetOption("SERIALPORT",-1,"crtscts","N")


## Load record instances
dbLoadRecords("db/arduino.db","PORT='SERIALPORT'")

#cd "/home/menorzinho/EPICS/ArduinoIOC/iocBoot/iocArduinoIOC"
iocInit

## Start any sequence programs
#seq sncxxx,"user=menorzinhoHost"
