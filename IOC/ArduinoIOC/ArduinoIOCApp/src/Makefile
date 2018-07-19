TOP=../..

include $(TOP)/configure/CONFIG
#----------------------------------------
#  ADD MACRO DEFINITIONS AFTER THIS LINE
#=============================

#=============================
# Build the IOC application

PROD_IOC = ArduinoIOC
# ArduinoIOC.dbd will be created and installed
DBD += ArduinoIOC.dbd

# ArduinoIOC.dbd will be made up from these files:
ArduinoIOC_DBD += base.dbd
ArduinoIOC_DBD += asyn.dbd
ArduinoIOC_DBD += stream.dbd
ArduinoIOC_DBD += drvAsynIPPort.dbd
ArduinoIOC_DBD += drvAsynSerialPort.dbd

# Include dbd files from all support applications:
#ArduinoIOC_DBD += xxx.dbd

# Add all the support libraries needed by this IOC
#ArduinoIOC_LIBS += xxx

# ArduinoIOC_registerRecordDeviceDriver.cpp derives from ArduinoIOC.dbd
ArduinoIOC_SRCS += ArduinoIOC_registerRecordDeviceDriver.cpp

# Build the main IOC entry point on workstation OSs.
ArduinoIOC_SRCS_DEFAULT += ArduinoIOCMain.cpp
ArduinoIOC_SRCS_vxWorks += -nil-

# Add support from base/src/vxWorks if needed
#ArduinoIOC_OBJS_vxWorks += $(EPICS_BASE_BIN)/vxComLibrary

# Finally link to the EPICS Base libraries
ArduinoIOC_LIBS += $(EPICS_BASE_IOC_LIBS)
ArduinoIOC_LIBS += asyn
ArduinoIOC_LIBS += stream
#===========================

include $(TOP)/configure/RULES
#----------------------------------------
#  ADD RULES AFTER THIS LINE

