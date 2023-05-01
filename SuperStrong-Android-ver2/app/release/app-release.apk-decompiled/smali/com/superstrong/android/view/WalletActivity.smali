.class public final Lcom/superstrong/android/view/WalletActivity;
.super Landroidx/fragment/app/r;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final w:[Ljava/lang/String;

.field public x:Lz3/o;

.field public y:Lb4/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/r;-><init>()V

    const-string v0, "\uc794\uae08"

    const-string v1, "\uac70\ub798\ub0b4\uc6a9"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/superstrong/android/view/WalletActivity;->w:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final B()Lz3/o;
    .locals 1

    iget-object v0, p0, Lcom/superstrong/android/view/WalletActivity;->x:Lz3/o;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Ll4/f;->k(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingInflatedId"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/r;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget v0, Lz3/o;->x:I

    .line 9
    .line 10
    sget-object v0, Landroidx/databinding/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 11
    .line 12
    const v0, 0x7f0c002a

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Landroidx/databinding/ViewDataBinding;->s(Landroid/view/LayoutInflater;I)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lz3/o;

    .line 20
    .line 21
    const-string v0, "inflate(layoutInflater)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/superstrong/android/view/WalletActivity;->x:Lz3/o;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p1, p1, Landroidx/databinding/ViewDataBinding;->h:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Landroidx/lifecycle/i0;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/l0;)V

    .line 40
    .line 41
    .line 42
    const-class v0, Lb4/h;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lb4/h;

    .line 49
    .line 50
    const-string v0, "<set-?>"

    .line 51
    .line 52
    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/superstrong/android/view/WalletActivity;->y:Lb4/h;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v0, p0, Lcom/superstrong/android/view/WalletActivity;->y:Lb4/h;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const-string v2, "viewModel"

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p1}, Lz3/o;->x()V

    .line 69
    .line 70
    .line 71
    new-instance p1, La4/j;

    .line 72
    .line 73
    invoke-direct {p1, p0}, La4/j;-><init>(Landroid/content/Context;)V

    .line 74
    .line 75
    .line 76
    const v0, 0x7f09017a

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v3, "findViewById(R.id.navigationView)"

    .line 84
    .line 85
    invoke-static {v0, v3}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 89
    .line 90
    new-instance v3, La4/l;

    .line 91
    .line 92
    invoke-direct {v3, p0}, La4/l;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v3}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setOnNavigationItemSelectedListener(Lcom/google/android/material/bottomnavigation/BottomNavigationView$b;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Lb4/s;

    .line 99
    .line 100
    invoke-direct {v0, p0}, Lb4/s;-><init>(Landroidx/fragment/app/r;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-object v3, v3, Lz3/o;->w:Landroidx/viewpager2/widget/ViewPager2;

    .line 108
    .line 109
    const-string v4, "binding.viewPager"

    .line 110
    .line 111
    invoke-static {v3, v4}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const/4 v4, 0x1

    .line 115
    invoke-virtual {v3, v4}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$d;)V

    .line 119
    .line 120
    .line 121
    const-string v0, "strong"

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-virtual {p0, v0, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v5, "ID"

    .line 129
    .line 130
    const-string v6, ""

    .line 131
    .line 132
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    const-string v5, "pub_ad"

    .line 137
    .line 138
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    const-string v7, "jwt_token"

    .line 143
    .line 144
    invoke-interface {v0, v7, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    const-string v7, "key"

    .line 149
    .line 150
    invoke-interface {v0, v7, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-static {v9}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const-string v0, "kkkkkkkkkkkkkkkkkkkk"

    .line 158
    .line 159
    invoke-static {v0, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    invoke-static {v10}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    invoke-static {v11}, Ll4/f;->c(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v0, v0, Lz3/o;->v:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iget-object v0, v0, Lz3/o;->t:Landroid/widget/TextView;

    .line 188
    .line 189
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    iget-object v8, p0, Lcom/superstrong/android/view/WalletActivity;->y:Lb4/h;

    .line 193
    .line 194
    if-eqz v8, :cond_5

    .line 195
    .line 196
    iget-object v0, v8, Lb4/h;->g:Landroidx/lifecycle/s;

    .line 197
    .line 198
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {v0, v5}, Landroidx/lifecycle/s;->j(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v8}, Landroidx/activity/k;->k(Landroidx/lifecycle/f0;)Ls4/w;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    new-instance v5, Lb4/g;

    .line 208
    .line 209
    const/4 v12, 0x0

    .line 210
    move-object v7, v5

    .line 211
    invoke-direct/range {v7 .. v12}, Lb4/g;-><init>(Lb4/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le4/d;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v5}, Lkotlinx/coroutines/internal/f;->b(Ls4/w;Lk4/p;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-object v0, v0, Lz3/o;->u:Lcom/google/android/material/tabs/TabLayout;

    .line 222
    .line 223
    const-string v5, "binding.tabLayout1"

    .line 224
    .line 225
    invoke-static {v0, v5}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    new-instance v5, Lcom/google/android/material/tabs/d;

    .line 229
    .line 230
    new-instance v6, Li0/d;

    .line 231
    .line 232
    const/4 v7, 0x5

    .line 233
    invoke-direct {v6, v7, p0}, Li0/d;-><init>(ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-direct {v5, v0, v3, v6}, Lcom/google/android/material/tabs/d;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Li0/d;)V

    .line 237
    .line 238
    .line 239
    iget-boolean v6, v5, Lcom/google/android/material/tabs/d;->e:Z

    .line 240
    .line 241
    if-nez v6, :cond_4

    .line 242
    .line 243
    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$d;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    iput-object v6, v5, Lcom/google/android/material/tabs/d;->d:Landroidx/recyclerview/widget/RecyclerView$d;

    .line 248
    .line 249
    if-eqz v6, :cond_3

    .line 250
    .line 251
    iput-boolean v4, v5, Lcom/google/android/material/tabs/d;->e:Z

    .line 252
    .line 253
    new-instance v6, Lcom/google/android/material/tabs/d$c;

    .line 254
    .line 255
    invoke-direct {v6, v0}, Lcom/google/android/material/tabs/d$c;-><init>(Lcom/google/android/material/tabs/TabLayout;)V

    .line 256
    .line 257
    .line 258
    iget-object v8, v3, Landroidx/viewpager2/widget/ViewPager2;->d:Landroidx/viewpager2/widget/a;

    .line 259
    .line 260
    iget-object v8, v8, Landroidx/viewpager2/widget/a;->a:Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    new-instance v6, Lcom/google/android/material/tabs/d$d;

    .line 266
    .line 267
    invoke-direct {v6, v3, v4}, Lcom/google/android/material/tabs/d$d;-><init>(Landroidx/viewpager2/widget/ViewPager2;Z)V

    .line 268
    .line 269
    .line 270
    iget-object v8, v0, Lcom/google/android/material/tabs/TabLayout;->M:Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-nez v9, :cond_0

    .line 277
    .line 278
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    :cond_0
    new-instance v6, Lcom/google/android/material/tabs/d$a;

    .line 282
    .line 283
    invoke-direct {v6, v5}, Lcom/google/android/material/tabs/d$a;-><init>(Lcom/google/android/material/tabs/d;)V

    .line 284
    .line 285
    .line 286
    iget-object v8, v5, Lcom/google/android/material/tabs/d;->d:Landroidx/recyclerview/widget/RecyclerView$d;

    .line 287
    .line 288
    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView$d;->a:Landroidx/recyclerview/widget/RecyclerView$e;

    .line 289
    .line 290
    invoke-virtual {v8, v6}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Lcom/google/android/material/tabs/d;->a()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    const/4 v5, 0x0

    .line 301
    invoke-virtual {v0, v3, v5, v4, v4}, Lcom/google/android/material/tabs/TabLayout;->k(IFZZ)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iget-object v0, v0, Lz3/o;->q:Landroid/widget/ImageView;

    .line 309
    .line 310
    const-string v3, "binding.imgPayment"

    .line 311
    .line 312
    invoke-static {v0, v3}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    iget-object v3, v3, Lz3/o;->s:Landroid/widget/ImageView;

    .line 320
    .line 321
    const-string v4, "binding.imgTimecoin"

    .line 322
    .line 323
    invoke-static {v3, v4}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0}, Lcom/superstrong/android/view/WalletActivity;->B()Lz3/o;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    iget-object v4, v4, Lz3/o;->r:Landroid/widget/ImageView;

    .line 331
    .line 332
    const-string v5, "binding.imgSwap"

    .line 333
    .line 334
    invoke-static {v4, v5}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    new-instance v5, La4/e;

    .line 338
    .line 339
    const/16 v6, 0x9

    .line 340
    .line 341
    invoke-direct {v5, v6, p0}, La4/e;-><init>(ILjava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    .line 346
    .line 347
    new-instance v0, Lm3/c;

    .line 348
    .line 349
    const/16 v5, 0xc

    .line 350
    .line 351
    invoke-direct {v0, v5, p0}, Lm3/c;-><init>(ILjava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Lf3/a;

    .line 358
    .line 359
    const/16 v3, 0x8

    .line 360
    .line 361
    invoke-direct {v0, v3, p0}, Lf3/a;-><init>(ILjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    .line 366
    .line 367
    iget-object v0, p0, Lcom/superstrong/android/view/WalletActivity;->y:Lb4/h;

    .line 368
    .line 369
    if-eqz v0, :cond_2

    .line 370
    .line 371
    iget-object v0, v0, Lb4/h;->g:Landroidx/lifecycle/s;

    .line 372
    .line 373
    new-instance v3, Lm3/j;

    .line 374
    .line 375
    invoke-direct {v3, v7, p1}, Lm3/j;-><init>(ILjava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, p0, v3}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 379
    .line 380
    .line 381
    iget-object p1, p0, Lcom/superstrong/android/view/WalletActivity;->y:Lb4/h;

    .line 382
    .line 383
    if-eqz p1, :cond_1

    .line 384
    .line 385
    iget-object p1, p1, Lb4/h;->h:Landroidx/lifecycle/s;

    .line 386
    .line 387
    new-instance v0, La4/h;

    .line 388
    .line 389
    const/4 v1, 0x3

    .line 390
    invoke-direct {v0, v1, p0}, La4/h;-><init>(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->e(Landroidx/lifecycle/o;Landroidx/lifecycle/t;)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :cond_1
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v1

    .line 401
    :cond_2
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v1

    .line 405
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 406
    .line 407
    const-string v0, "TabLayoutMediator attached before ViewPager2 has an adapter"

    .line 408
    .line 409
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    throw p1

    .line 413
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 414
    .line 415
    const-string v0, "TabLayoutMediator is already attached"

    .line 416
    .line 417
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    throw p1

    .line 421
    :cond_5
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw v1

    .line 425
    :cond_6
    invoke-static {v2}, Ll4/f;->k(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v1
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
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
