import express from 'express';
import { signUp, signIn, getUserById } from '../users/mainController.js';

const router = express.Router();

router.post('/sign-up', signUp);

router.post('/sign-in', signIn);

router.post('/user/:id', getUserById);

export default router;