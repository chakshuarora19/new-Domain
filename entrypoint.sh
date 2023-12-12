#!/bin/bash

MEMORY_USAGE=$(free -m | awk 'NR==2{printf "%.2f%%", $3*100/$2 }')

echo "Memory Utilization: $MEMORY_USAGE"
