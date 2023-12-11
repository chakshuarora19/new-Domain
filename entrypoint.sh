# entrypoint.sh
#!/bin/bash
set -e

# Get memory utilization
MEMORY_USAGE=$(ps aux --sort=-%mem | awk 'NR==2{print $4}')

# Output memory utilization
echo "::set-output name=memory::${MEMORY_USAGE}%"
