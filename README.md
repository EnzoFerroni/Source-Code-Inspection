# Source Code Inspection

[![Java](https://img.shields.io/badge/Java-007396?logo=openjdk&logoColor=white)](https://openjdk.org)
[![Software Quality](https://img.shields.io/badge/Software%20Quality-code%20inspection-555555)](#about)

A code inspection lab: finding and documenting defects in a Java ticket machine, then delivering a corrected version.

## Table of Contents

- [About](#about)
- [What Was Done](#what-was-done)
- [Repository Structure](#repository-structure)
- [Credits](#credits)

## About

Lab 2 of a software quality course at Universidade Presbiteriana Mackenzie (2025).
The starting point is a deliberately flawed `TicketMachine` program provided by the
professor in [Prof-Calebe/Source-Code-Inspection](https://github.com/Prof-Calebe/Source-Code-Inspection).
The task was to inspect it line by line with a defect checklist, record each problem
and fix it. The report is in Portuguese.

## What Was Done

- Inspection of the original classes in `Source Code Inspection/` with a defect
  checklist (logic, data, interface and exception handling)
- Inspection report: [`documentação/Lab02 - Enzo Ferroni e Rafael Neves.pdf`](documenta%C3%A7%C3%A3o/)
- Corrected classes in [`códigos/`](c%C3%B3digos/): `TicketMachine`, `Troco`,
  `PapelMoeda` and the custom exceptions

## Repository Structure

```
├── Source Code Inspection/   Original NetBeans project from the course
├── códigos/                  Corrected Java classes
├── documentação/             Inspection checklist and final report
└── lib/                      Course libraries
```

## Credits

Original code and lab by Prof. Calebe de Paula Bianchini. Inspection and fixes by
Enzo Ferroni ([@EnzoFerroni](https://github.com/EnzoFerroni)) and Rafael Neves.
