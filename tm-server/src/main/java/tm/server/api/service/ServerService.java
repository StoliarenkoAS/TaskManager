package tm.server.api.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tm.common.comparator.ComparatorType;

public interface ServerService {

    @NotNull
    String showAbout();

    @NotNull
    Boolean shutdown();

    @NotNull
    String showHelp();

    @NotNull
    Boolean setSortMethod(@Nullable ComparatorType comparatorType);

    @NotNull
    Boolean dataClearBinary();

    @NotNull
    Boolean dataSaveBinary();

    @NotNull
    Boolean dataLoadBinary();

    @NotNull
    Boolean dataClearJaxbXml();

    @NotNull
    Boolean dataSaveJaxbXml();

    @NotNull
    Boolean dataLoadJaxbXml();

    @NotNull
    Boolean dataClearJaxbJson();

    @NotNull
    Boolean dataSaveJaxbJson();

    @NotNull
    Boolean dataLoadJaxbJson();

    @NotNull
    Boolean dataClearFasterXml();

    @NotNull
    Boolean dataSaveFasterXml();

    @NotNull
    Boolean dataLoadFasterXml();

    @NotNull
    Boolean dataClearFasterJson();

    @NotNull
    Boolean dataSaveFasterJson();

    @NotNull
    Boolean dataLoadFasterJson();

}
