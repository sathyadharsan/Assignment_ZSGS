@echo off
setlocal enabledelayedexpansion

for %%f in (*.txt) do (
    set "filename=%%~nf"
    ren "%%f" "!filename!.java"
)

echo All .txt files have been renamed to .java
pause
