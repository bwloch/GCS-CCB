TOP=../..

include $(TOP)/configure/CONFIG
#----------------------------------------
#  ADD MACRO DEFINITIONS AFTER THIS LINE
#=============================

#=============================
# Build the IOC application

PROD_IOC = Bronk_test
# Bronk_test.dbd will be created and installed
DBD += Bronk_test.dbd

# Bronk_test.dbd will be made up from these files:
Bronk_test_DBD += base.dbd
Bronk_test_DBD += asyn.dbd
Bronk_test_DBD += stream.dbd
Bronk_test_DBD += drvAsynIPPort.dbd
Bronk_test_DBD += drvAsynSerialPort.dbd

# Include dbd files from all support applications:
#Bronk_test_DBD += xxx.dbd

# Add all the support libraries needed by this IOC
#Bronk_test_LIBS += xxx

# Bronk_test_registerRecordDeviceDriver.cpp derives from Bronk_test.dbd
Bronk_test_SRCS += Bronk_test_registerRecordDeviceDriver.cpp

# Build the main IOC entry point on workstation OSs.
Bronk_test_SRCS_DEFAULT += Bronk_testMain.cpp
Bronk_test_SRCS_vxWorks += -nil-

# Add support from base/src/vxWorks if needed
#Bronk_test_OBJS_vxWorks += $(EPICS_BASE_BIN)/vxComLibrary

# Finally link to the EPICS Base libraries
Bronk_test_LIBS += $(EPICS_BASE_IOC_LIBS)
Bronk_test_LIBS += asyn
Bronk_test_LIBS += stream

#===========================

include $(TOP)/configure/RULES
#----------------------------------------
#  ADD RULES AFTER THIS LINE

