@echo off
echo Running JaCoCo Coverage...
call mvn clean test jacoco:report
if %ERRORLEVEL% EQU 0 (
    echo.
    echo coverage report generated at: target/site/jacoco/index.html
    echo You can open it in your browser.
) else (
    echo.
    echo Build failed. Please ensure Maven is installed and accessible.
)
pause
