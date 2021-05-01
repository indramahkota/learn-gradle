# Learn Gradle

- Persyaratan

  - Java JDK versi 8 atau lebih tinggi.

    Install java

    ```sh
    $ sudo apt install openjdk-11-jdk -y
    Tunggu sampai proses selesai "done".
    ```

    Cek versi java

    ```sh
    $ java -version
    openjdk 11.0.10 2021-01-19 LTS
    OpenJDK Runtime Environment Corretto-11.0.10.9.1 (build 11.0.10+9-LTS)
    OpenJDK 64-Bit Server VM Corretto-11.0.10.9.1 (build 11.0.10+9-LTS, mixed mode)
    ```

- Menginstall SDKMAN!

  Install unzip dan zip

    ```sh
    $ sudo apt-get install zip
    The following additional packages will be installed:
    unzip
    The following NEW packages will be installed:
    unzip zip
    ```

    Eksekusi scripts yang ada pada url untuk meng-install

    ```sh
    $ curl -s "https://get.sdkman.io" | bash
    Tunggu sampai proses selesai "done".
    ```

    Baca dan eksekusi scripts pada file yang dituju untuk memulai konfigurasi sdkman

    ```sh
    source "$HOME/.sdkman/bin/sdkman-init.sh"
    ```

    Cek versi sdkman

    ```sh
    $ sdk version
    SDKMAN 5.11.2+698
    ```

- Menginstall Gradle

    ```sh
    $ sdk install gradle 7.0
    Installing: gradle 7.0
    Done installing!
    ```

    Export path for Gradle

    ```sh
    export PATH=$PATH:/opt/gradle/gradle-7.0/bin
    ```

    Cek versi gradle

    ```sh
    $ gradle -v
    ------------------------------------------------------------
    Gradle 7.0
    ------------------------------------------------------------

    Build time:   2021-04-09 22:27:31 UTC
    Revision:     d5661e3f0e07a8caff705f1badf79fb5df8022c4

    Kotlin:       1.4.31
    Groovy:       3.0.7
    Ant:          Apache Ant(TM) version 1.10.9 compiled on September 27 2020
    JVM:          11.0.11 (Ubuntu 11.0.11+9-Ubuntu-0ubuntu2.20.04)
    OS:           Linux 5.4.72-microsoft-standard-WSL2 amd64
    ```
