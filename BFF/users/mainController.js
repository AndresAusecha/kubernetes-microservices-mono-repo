import fetch from "node-fetch";

export const signUp = async (req, res) => {
  try {
    console.log('received request:', req);
    const response = await fetch('http://users:8081/api/v1/users', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(req.body)
    });

    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`);
    }

    const data = await response.json();
    console.log('Success:', data);
    res.json({ ...data });
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

export const signIn = (req, res) => {
  res.json({ message: 'Welcome to the sign in!' });
};

export const getUserById = (req, res) => {
  res.json({ message: 'Welcome to the sign in!' });
};