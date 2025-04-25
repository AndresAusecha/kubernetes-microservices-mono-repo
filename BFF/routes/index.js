const express = require('express');
const router = express.Router();
const mainController = require('../users/mainController');

router.post('/sign-up', mainController.signUp);

router.post('/sign-in', mainController.signIn);

router.post('/user/:id', mainController.getUserById);

module.exports = router;