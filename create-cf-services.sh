#!/usr/bin/env bash
cf create-service p-mysql 100mb tracker-allocations-database
cf create-service p-mysql 100mb tracker-backlog-database
cf create-service p-mysql 100mb tracker-registration-database
cf create-service p-mysql 100mb tracker-timesheets-database

cf create-service p-service-registry standard tracker-service-registry
cf create-service p-identity p-identity tracker-sso