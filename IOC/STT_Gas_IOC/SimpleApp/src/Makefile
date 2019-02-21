TOP=../..

include $(TOP)/configure/CONFIG
#----------------------------------------
#  ADD MACRO DEFINITIONS AFTER THIS LINE
#=============================

#=============================
# Build the IOC application

PROD_IOC = Simple
# Simple.dbd will be created and installed
DBD += Simple.dbd

# Simple.dbd will be made up from these files:
Simple_DBD += base.dbd

# Include dbd files from all support applications:
#Simple_DBD += xxx.dbd

# Add all the support libraries needed by this IOC
#Simple_LIBS += xxx

# Simple_registerRecordDeviceDriver.cpp derives from Simple.dbd
Simple_SRCS += Simple_registerRecordDeviceDriver.cpp

# Build the main IOC entry point on workstation OSs.
Simple_SRCS_DEFAULT += SimpleMain.cpp
Simple_SRCS_vxWorks += -nil-

# Add support from base/src/vxWorks if needed
#Simple_OBJS_vxWorks += $(EPICS_BASE_BIN)/vxComLibrary

# Finally link to the EPICS Base libraries
Simple_LIBS += $(EPICS_BASE_IOC_LIBS)

#===========================

include $(TOP)/configure/RULES
#----------------------------------------
#  ADD RULES AFTER THIS LINE

