# Use official Node.js image
FROM node:16-alpine

# Set working directory
WORKDIR /app

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of your app
COPY . .

# Set environment variable (optional)
ENV NODE_ENV=production

# Expose port (adjust to your app's port)
EXPOSE 3000

# Start the app
CMD ["node", "server.js"]