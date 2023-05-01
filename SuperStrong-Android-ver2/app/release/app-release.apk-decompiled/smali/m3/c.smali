.class public final synthetic Lm3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lm3/c;->b:I

    iput-object p2, p0, Lm3/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget p1, p0, Lm3/c;->b:I

    .line 2
    .line 3
    const-class v0, Lcom/superstrong/android/view/WalletActivity;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "this$0"

    .line 7
    .line 8
    iget-object v3, p0, Lm3/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :pswitch_0
    check-cast v3, Lcom/superstrong/android/view/WalletActivity;

    .line 16
    .line 17
    sget p1, Lcom/superstrong/android/view/WalletActivity;->z:I

    .line 18
    .line 19
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Landroid/content/Intent;

    .line 23
    .line 24
    const-class v0, Lcom/superstrong/android/view/TimeCoinActivity;

    .line 25
    .line 26
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    check-cast v3, Lcom/superstrong/android/view/TimeCoinActivity;

    .line 34
    .line 35
    sget p1, Lcom/superstrong/android/view/TimeCoinActivity;->y:I

    .line 36
    .line 37
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Landroid/content/Intent;

    .line 41
    .line 42
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    check-cast v3, Lcom/superstrong/android/view/SwapActivity2;

    .line 53
    .line 54
    sget p1, Lcom/superstrong/android/view/SwapActivity2;->y:I

    .line 55
    .line 56
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Landroid/content/Intent;

    .line 60
    .line 61
    const-class v0, Lcom/superstrong/android/view/SwapActivity;

    .line 62
    .line 63
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_3
    check-cast v3, La4/o;

    .line 74
    .line 75
    sget p1, La4/o;->X:I

    .line 76
    .line 77
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, v3, La4/o;->W:Landroidx/lifecycle/g0;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/lifecycle/g0;->a()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lb4/r;

    .line 87
    .line 88
    iget-object v0, v3, La4/o;->V:Lz3/r;

    .line 89
    .line 90
    invoke-static {v0}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v0, Lz3/r;->f:Landroid/view/View;

    .line 94
    .line 95
    check-cast v0, Landroid/widget/EditText;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v2, v3, La4/o;->V:Lz3/r;

    .line 106
    .line 107
    invoke-static {v2}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, v2, Lz3/r;->h:Landroid/view/View;

    .line 111
    .line 112
    check-cast v2, Landroid/widget/EditText;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-object v4, v3, La4/o;->V:Lz3/r;

    .line 123
    .line 124
    invoke-static {v4}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v4, v4, Lz3/r;->i:Landroid/view/View;

    .line 128
    .line 129
    check-cast v4, Landroid/widget/EditText;

    .line 130
    .line 131
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    iget-object v5, v3, La4/o;->V:Lz3/r;

    .line 140
    .line 141
    invoke-static {v5}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object v5, v5, Lz3/r;->e:Landroid/view/View;

    .line 145
    .line 146
    check-cast v5, Landroid/widget/EditText;

    .line 147
    .line 148
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    iget-object v3, v3, La4/o;->V:Lz3/r;

    .line 157
    .line 158
    invoke-static {v3}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object v3, v3, Lz3/r;->g:Landroid/view/View;

    .line 162
    .line 163
    check-cast v3, Landroid/widget/EditText;

    .line 164
    .line 165
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    const-string v6, "id"

    .line 177
    .line 178
    invoke-static {v0, v6}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string v6, "pass1"

    .line 182
    .line 183
    invoke-static {v2, v6}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const-string v6, "pass2"

    .line 187
    .line 188
    invoke-static {v4, v6}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v6, "mail"

    .line 192
    .line 193
    invoke-static {v5, v6}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const-string v6, "phone"

    .line 197
    .line 198
    invoke-static {v3, v6}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const-string v6, ""

    .line 202
    .line 203
    invoke-static {v0, v6}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    iget-object v8, p1, Lb4/r;->g:Landroidx/lifecycle/s;

    .line 208
    .line 209
    if-nez v7, :cond_2

    .line 210
    .line 211
    invoke-static {v2, v6}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    if-nez v7, :cond_2

    .line 216
    .line 217
    invoke-static {v4, v6}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-nez v7, :cond_2

    .line 222
    .line 223
    invoke-static {v5, v6}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-nez v7, :cond_2

    .line 228
    .line 229
    invoke-static {v3, v6}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_0

    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_0
    invoke-static {v2, v4}, Ll4/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-nez v4, :cond_1

    .line 241
    .line 242
    const/4 p1, 0x7

    .line 243
    goto :goto_1

    .line 244
    :cond_1
    new-instance v4, Ly3/a0;

    .line 245
    .line 246
    invoke-direct {v4, v0, v2, v5, v3}, Ly3/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object v0, p1, Lb4/r;->h:Landroidx/lifecycle/s;

    .line 250
    .line 251
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-static {p1}, Landroidx/activity/k;->k(Landroidx/lifecycle/f0;)Ls4/w;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    new-instance v2, Lb4/q;

    .line 261
    .line 262
    invoke-direct {v2, p1, v4, v1}, Lb4/q;-><init>(Lb4/r;Ly3/a0;Le4/d;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v0, v2}, Lkotlinx/coroutines/internal/f;->b(Ls4/w;Lk4/p;)V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_2
    :goto_0
    const/4 p1, 0x6

    .line 270
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {v8, p1}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :goto_2
    return-void

    .line 278
    :pswitch_4
    check-cast v3, La4/n;

    .line 279
    .line 280
    sget p1, La4/n;->X:I

    .line 281
    .line 282
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-object p1, v3, La4/n;->W:Landroidx/lifecycle/g0;

    .line 286
    .line 287
    invoke-virtual {p1}, Landroidx/lifecycle/g0;->a()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    check-cast p1, Lb4/r;

    .line 292
    .line 293
    iget-object p1, p1, Lb4/r;->e:Landroidx/lifecycle/s;

    .line 294
    .line 295
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {p1, v0}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :pswitch_5
    check-cast v3, Lcom/superstrong/android/view/PaymentActivity3;

    .line 302
    .line 303
    sget p1, Lcom/superstrong/android/view/PaymentActivity3;->y:I

    .line 304
    .line 305
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    new-instance p1, Landroid/content/Intent;

    .line 309
    .line 310
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_6
    check-cast v3, Lcom/superstrong/android/view/PaymentActivity2;

    .line 321
    .line 322
    sget p1, Lcom/superstrong/android/view/PaymentActivity2;->z:I

    .line 323
    .line 324
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    new-instance p1, Landroid/content/Intent;

    .line 328
    .line 329
    const-class v0, Lcom/superstrong/android/view/PaymentActivity;

    .line 330
    .line 331
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :pswitch_7
    check-cast v3, Lcom/superstrong/android/view/FindPassActivity2;

    .line 342
    .line 343
    sget p1, Lcom/superstrong/android/view/FindPassActivity2;->x:I

    .line 344
    .line 345
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    new-instance p1, Landroid/content/Intent;

    .line 349
    .line 350
    const-class v0, Lcom/superstrong/android/view/lallaaaalllaa;

    .line 351
    .line 352
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :pswitch_8
    check-cast v3, La4/g;

    .line 360
    .line 361
    sget p1, La4/g;->X:I

    .line 362
    .line 363
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object p1, v3, La4/g;->W:Landroidx/lifecycle/g0;

    .line 367
    .line 368
    invoke-virtual {p1}, Landroidx/lifecycle/g0;->a()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    check-cast p1, Lb4/e;

    .line 373
    .line 374
    iget-object p1, p1, Lb4/e;->h:Landroidx/lifecycle/s;

    .line 375
    .line 376
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 377
    .line 378
    invoke-virtual {p1, v0}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :pswitch_9
    check-cast v3, La4/d;

    .line 383
    .line 384
    sget p1, La4/d;->X:I

    .line 385
    .line 386
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object p1, v3, La4/d;->W:Landroidx/lifecycle/g0;

    .line 390
    .line 391
    invoke-virtual {p1}, Landroidx/lifecycle/g0;->a()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    check-cast p1, Lb4/e;

    .line 396
    .line 397
    iget-object v0, v3, La4/d;->V:Lm/c;

    .line 398
    .line 399
    invoke-static {v0}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    iget-object v0, v0, Lm/c;->b:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 405
    .line 406
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-static {p1}, Landroidx/activity/k;->k(Landroidx/lifecycle/f0;)Ls4/w;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    new-instance v3, Lb4/c;

    .line 422
    .line 423
    invoke-direct {v3, p1, v0, v1}, Lb4/c;-><init>(Lb4/e;Ljava/lang/String;Le4/d;)V

    .line 424
    .line 425
    .line 426
    invoke-static {v2, v3}, Lkotlinx/coroutines/internal/f;->b(Ls4/w;Lk4/p;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :pswitch_a
    check-cast v3, Lm3/w;

    .line 431
    .line 432
    iget-object p1, v3, Lm3/w;->f:Landroid/widget/EditText;

    .line 433
    .line 434
    if-nez p1, :cond_3

    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_3
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 438
    .line 439
    .line 440
    move-result p1

    .line 441
    iget-object v0, v3, Lm3/w;->f:Landroid/widget/EditText;

    .line 442
    .line 443
    if-eqz v0, :cond_4

    .line 444
    .line 445
    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    .line 450
    .line 451
    if-eqz v0, :cond_4

    .line 452
    .line 453
    const/4 v0, 0x1

    .line 454
    goto :goto_3

    .line 455
    :cond_4
    const/4 v0, 0x0

    .line 456
    :goto_3
    if-eqz v0, :cond_5

    .line 457
    .line 458
    iget-object v0, v3, Lm3/w;->f:Landroid/widget/EditText;

    .line 459
    .line 460
    goto :goto_4

    .line 461
    :cond_5
    iget-object v0, v3, Lm3/w;->f:Landroid/widget/EditText;

    .line 462
    .line 463
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    :goto_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 468
    .line 469
    .line 470
    if-ltz p1, :cond_6

    .line 471
    .line 472
    iget-object v0, v3, Lm3/w;->f:Landroid/widget/EditText;

    .line 473
    .line 474
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 475
    .line 476
    .line 477
    :cond_6
    invoke-virtual {v3}, Lm3/p;->q()V

    .line 478
    .line 479
    .line 480
    :goto_5
    return-void

    .line 481
    :pswitch_b
    check-cast v3, Lm3/o;

    .line 482
    .line 483
    invoke-virtual {v3}, Lm3/o;->u()V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :pswitch_c
    check-cast v3, Lm3/g;

    .line 488
    .line 489
    iget-object p1, v3, Lm3/g;->i:Landroid/widget/EditText;

    .line 490
    .line 491
    if-nez p1, :cond_7

    .line 492
    .line 493
    goto :goto_6

    .line 494
    :cond_7
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    if-eqz p1, :cond_8

    .line 499
    .line 500
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 501
    .line 502
    .line 503
    :cond_8
    invoke-virtual {v3}, Lm3/p;->q()V

    .line 504
    .line 505
    .line 506
    :goto_6
    return-void

    .line 507
    :goto_7
    check-cast v3, Lcom/superstrong/android/view/lallaaaalllaa;

    .line 508
    .line 509
    sget p1, Lcom/superstrong/android/view/lallaaaalllaa;->z:I

    .line 510
    .line 511
    invoke-static {v3, v2}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    new-instance p1, Landroid/content/Intent;

    .line 515
    .line 516
    const-class v0, Lcom/superstrong/android/view/SignupActivity;

    .line 517
    .line 518
    invoke-direct {p1, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method
