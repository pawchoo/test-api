IF EXIST "target" RMDIR /S /Q "target"
s2i build . amazoncorretto:11-alpine user-service -e GC_MAX_METASPACE_SIZE=2000 -e AB_JOLOKIA_OFF=true -c --incremental